.class public final LD/v;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LD/v;->q:I

    iput-object p3, p0, LD/v;->s:Ljava/lang/Object;

    iput p1, p0, LD/v;->r:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(ILjava/util/Collection;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LD/v;->q:I

    .line 2
    iput p1, p0, LD/v;->r:I

    iput-object p2, p0, LD/v;->s:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LD/v;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    iget-object v0, p0, LD/v;->s:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/Collection;

    .line 11
    .line 12
    iget v1, p0, LD/v;->r:I

    .line 13
    .line 14
    invoke-interface {p1, v1, v0}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lz0/I;

    .line 24
    .line 25
    iget-object v0, p0, LD/v;->s:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lz0/J;

    .line 28
    .line 29
    iget v1, p0, LD/v;->r:I

    .line 30
    .line 31
    neg-int v1, v1

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-static {p1, v0, v2, v1}, Lz0/I;->d(Lz0/I;Lz0/J;II)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_1
    check-cast p1, LE/I;

    .line 40
    .line 41
    iget-object v0, p0, LD/v;->s:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LD/y;

    .line 44
    .line 45
    iget-object v0, v0, LD/y;->a:LC/a;

    .line 46
    .line 47
    invoke-static {}, La0/r;->c()La0/h;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    invoke-virtual {v1}, La0/h;->e()LB5/c;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/4 v2, 0x0

    .line 59
    :goto_0
    invoke-static {v1}, La0/r;->d(La0/h;)La0/h;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v1, v3, v2}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    :goto_1
    const/4 v1, 0x2

    .line 71
    if-ge v0, v1, :cond_1

    .line 72
    .line 73
    iget v1, p0, LD/v;->r:I

    .line 74
    .line 75
    add-int/2addr v1, v0

    .line 76
    invoke-virtual {p1, v1}, LE/I;->a(I)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 83
    .line 84
    return-object p1

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
