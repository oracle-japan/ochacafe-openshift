#Stage-1
FROM golang:1.16 as builder
COPY ./main.go ./
RUN go build -o /go-app ./main.go

#Stage-2
FROM gcr.io/distroless/base
EXPOSE 8080
COPY --from=builder /go-app /.
ENTRYPOINT ["./go-app"]