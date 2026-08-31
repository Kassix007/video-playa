.class public final Lu/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LZ/m;

.field public final b:LP/f0;

.field public final synthetic c:Lu/v0;


# direct methods
.method public constructor <init>(Lu/v0;LZ/m;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu/p0;->c:Lu/v0;

    .line 5
    .line 6
    iput-object p2, p0, Lu/p0;->a:LZ/m;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lu/p0;->b:LP/f0;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(LB5/c;LB5/c;)Lu/o0;
    .locals 8

    .line 1
    iget-object v0, p0, Lu/p0;->b:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lu/o0;

    .line 8
    .line 9
    iget-object v2, p0, Lu/p0;->c:Lu/v0;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lu/o0;

    .line 14
    .line 15
    new-instance v3, Lu/s0;

    .line 16
    .line 17
    iget-object v4, v2, Lu/v0;->a:LO3/D0;

    .line 18
    .line 19
    invoke-virtual {v4}, LO3/D0;->j()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-interface {p2, v4}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, v2, Lu/v0;->a:LO3/D0;

    .line 28
    .line 29
    invoke-virtual {v5}, LO3/D0;->j()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-interface {p2, v5}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v6, p0, Lu/p0;->a:LZ/m;

    .line 38
    .line 39
    iget-object v7, v6, LZ/m;->s:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v7, LB5/c;

    .line 42
    .line 43
    invoke-interface {v7, v5}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Lu/q;

    .line 48
    .line 49
    invoke-virtual {v5}, Lu/q;->d()V

    .line 50
    .line 51
    .line 52
    invoke-direct {v3, v2, v4, v5, v6}, Lu/s0;-><init>(Lu/v0;Ljava/lang/Object;Lu/q;LZ/m;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, p0, v3, p1, p2}, Lu/o0;-><init>(Lu/p0;Lu/s0;LB5/c;LB5/c;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, v2, Lu/v0;->i:La0/q;

    .line 62
    .line 63
    invoke-virtual {v0, v3}, La0/q;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_0
    check-cast p2, Lkotlin/jvm/internal/n;

    .line 67
    .line 68
    iput-object p2, v1, Lu/o0;->s:Lkotlin/jvm/internal/n;

    .line 69
    .line 70
    iput-object p1, v1, Lu/o0;->r:LB5/c;

    .line 71
    .line 72
    invoke-virtual {v2}, Lu/v0;->f()Lu/q0;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v1, p1}, Lu/o0;->b(Lu/q0;)V

    .line 77
    .line 78
    .line 79
    return-object v1
.end method
