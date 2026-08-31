.class public final LA/C;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/w0;


# instance fields
.field public E:Lc0/c;


# virtual methods
.method public final c0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    instance-of v0, p1, LA/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LA/N;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    new-instance p1, LA/N;

    .line 12
    .line 13
    invoke-direct {p1}, LA/N;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, LA/C;->E:Lc0/c;

    .line 17
    .line 18
    new-instance v1, LA/w;

    .line 19
    .line 20
    invoke-direct {v1, v0}, LA/w;-><init>(Lc0/c;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p1, LA/N;->c:LA/w;

    .line 24
    .line 25
    return-object p1
.end method
