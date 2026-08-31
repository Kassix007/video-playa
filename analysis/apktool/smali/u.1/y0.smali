.class public abstract Lu/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lm5/i;->r:Lm5/i;

    .line 2
    .line 3
    sget-object v1, Lu/w0;->q:Lu/w0;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lm5/a;->c(Lm5/i;LB5/a;)Lm5/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lu/y0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(Lu/v0;LZ/m;Ljava/lang/String;LP/o;II)Lu/p0;
    .locals 1

    .line 1
    and-int/lit8 p4, p5, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const-string p2, "DeferredAnimation"

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p3, p0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    invoke-virtual {p3}, LP/o;->H()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p5

    .line 15
    sget-object v0, LP/k;->a:LP/S;

    .line 16
    .line 17
    if-nez p4, :cond_1

    .line 18
    .line 19
    if-ne p5, v0, :cond_2

    .line 20
    .line 21
    :cond_1
    new-instance p5, Lu/p0;

    .line 22
    .line 23
    invoke-direct {p5, p0, p1, p2}, Lu/p0;-><init>(Lu/v0;LZ/m;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3, p5}, LP/o;->d0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    check-cast p5, Lu/p0;

    .line 30
    .line 31
    invoke-virtual {p3, p0}, LP/o;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {p3, p5}, LP/o;->i(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    or-int/2addr p1, p2

    .line 40
    invoke-virtual {p3}, LP/o;->H()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    if-ne p2, v0, :cond_4

    .line 47
    .line 48
    :cond_3
    new-instance p2, LA/Y;

    .line 49
    .line 50
    const/16 p1, 0x1c

    .line 51
    .line 52
    invoke-direct {p2, p1, p0, p5}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, p2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    check-cast p2, LB5/c;

    .line 59
    .line 60
    invoke-static {p5, p2, p3}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lu/v0;->g()Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_5

    .line 68
    .line 69
    iget-object p0, p5, Lu/p0;->b:LP/f0;

    .line 70
    .line 71
    invoke-virtual {p0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Lu/o0;

    .line 76
    .line 77
    if-eqz p0, :cond_5

    .line 78
    .line 79
    iget-object p1, p5, Lu/p0;->c:Lu/v0;

    .line 80
    .line 81
    iget-object p2, p0, Lu/o0;->q:Lu/s0;

    .line 82
    .line 83
    iget-object p3, p0, Lu/o0;->s:Lkotlin/jvm/internal/n;

    .line 84
    .line 85
    invoke-virtual {p1}, Lu/v0;->f()Lu/q0;

    .line 86
    .line 87
    .line 88
    move-result-object p4

    .line 89
    invoke-interface {p4}, Lu/q0;->a()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p4

    .line 93
    invoke-interface {p3, p4}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    iget-object p4, p0, Lu/o0;->s:Lkotlin/jvm/internal/n;

    .line 98
    .line 99
    invoke-virtual {p1}, Lu/v0;->f()Lu/q0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {v0}, Lu/q0;->c()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {p4, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p4

    .line 111
    iget-object p0, p0, Lu/o0;->r:LB5/c;

    .line 112
    .line 113
    invoke-virtual {p1}, Lu/v0;->f()Lu/q0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {p0, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Lu/z;

    .line 122
    .line 123
    invoke-virtual {p2, p3, p4, p0}, Lu/s0;->f(Ljava/lang/Object;Ljava/lang/Object;Lu/z;)V

    .line 124
    .line 125
    .line 126
    :cond_5
    return-object p5
.end method
