.class public final LF/t;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Z

.field public final synthetic r:LF/e;

.field public final synthetic s:LM5/w;


# direct methods
.method public constructor <init>(ZLF/e;LM5/w;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LF/t;->q:Z

    .line 2
    .line 3
    iput-object p2, p0, LF/t;->r:LF/e;

    .line 4
    .line 5
    iput-object p3, p0, LF/t;->s:LM5/w;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, LI0/i;

    .line 2
    .line 3
    iget-boolean v0, p0, LF/t;->q:Z

    .line 4
    .line 5
    iget-object v1, p0, LF/t;->s:LM5/w;

    .line 6
    .line 7
    iget-object v2, p0, LF/t;->r:LF/e;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, LF/s;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v0, v2, v1, v4}, LF/s;-><init>(LF/e;LM5/w;I)V

    .line 16
    .line 17
    .line 18
    sget-object v4, LI0/r;->a:[LH5/k;

    .line 19
    .line 20
    sget-object v4, LI0/h;->w:LI0/s;

    .line 21
    .line 22
    new-instance v5, LI0/a;

    .line 23
    .line 24
    invoke-direct {v5, v3, v0}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v4, v5}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, LF/s;

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    invoke-direct {v0, v2, v1, v4}, LF/s;-><init>(LF/e;LM5/w;I)V

    .line 34
    .line 35
    .line 36
    sget-object v1, LI0/h;->y:LI0/s;

    .line 37
    .line 38
    new-instance v2, LI0/a;

    .line 39
    .line 40
    invoke-direct {v2, v3, v0}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1, v2}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, LF/s;

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    invoke-direct {v0, v2, v1, v4}, LF/s;-><init>(LF/e;LM5/w;I)V

    .line 51
    .line 52
    .line 53
    sget-object v4, LI0/r;->a:[LH5/k;

    .line 54
    .line 55
    sget-object v4, LI0/h;->x:LI0/s;

    .line 56
    .line 57
    new-instance v5, LI0/a;

    .line 58
    .line 59
    invoke-direct {v5, v3, v0}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v4, v5}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance v0, LF/s;

    .line 66
    .line 67
    const/4 v4, 0x3

    .line 68
    invoke-direct {v0, v2, v1, v4}, LF/s;-><init>(LF/e;LM5/w;I)V

    .line 69
    .line 70
    .line 71
    sget-object v1, LI0/h;->z:LI0/s;

    .line 72
    .line 73
    new-instance v2, LI0/a;

    .line 74
    .line 75
    invoke-direct {v2, v3, v0}, LI0/a;-><init>(Ljava/lang/String;Lm5/e;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v1, v2}, LI0/i;->j(LI0/s;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 82
    .line 83
    return-object p1
.end method
