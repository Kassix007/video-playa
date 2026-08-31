.class public abstract Lc0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/StackTraceElement;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/StackTraceElement;

    .line 3
    .line 4
    sput-object v0, Lc0/o;->a:[Ljava/lang/StackTraceElement;

    .line 5
    .line 6
    return-void
.end method

.method public static final a(Lc0/m;LB5/f;)Lc0/m;
    .locals 1

    .line 1
    new-instance v0, Lc0/h;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lc0/h;-><init>(LB5/f;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final b(LP/o;Lc0/m;)Lc0/m;
    .locals 2

    .line 1
    sget-object v0, Lc0/i;->q:Lc0/i;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lc0/m;->a(LB5/c;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    const v0, 0x48ae8da7

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, LP/o;->T(I)V

    .line 14
    .line 15
    .line 16
    new-instance v0, LA/e0;

    .line 17
    .line 18
    const/16 v1, 0xd

    .line 19
    .line 20
    invoke-direct {v0, v1, p0}, LA/e0;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lc0/j;->q:Lc0/j;

    .line 24
    .line 25
    invoke-interface {p1, v1, v0}, Lc0/m;->b(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Lc0/m;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-virtual {p0, v0}, LP/o;->p(Z)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public static final c(LP/o;Lc0/m;)Lc0/m;
    .locals 1

    .line 1
    const v0, 0x1a365f2c

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, LP/o;->S(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, Lc0/o;->b(LP/o;Lc0/m;)Lc0/m;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, LP/o;->p(Z)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method
