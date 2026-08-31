.class public final LA/H;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/w0;


# instance fields
.field public E:F

.field public F:Z


# virtual methods
.method public final c0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

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
    iget v0, p0, LA/H;->E:F

    .line 17
    .line 18
    iput v0, p1, LA/N;->a:F

    .line 19
    .line 20
    iget-boolean v0, p0, LA/H;->F:Z

    .line 21
    .line 22
    iput-boolean v0, p1, LA/N;->b:Z

    .line 23
    .line 24
    return-object p1
.end method
