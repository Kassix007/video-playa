.class public final LA/E;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Lz0/J;

.field public final synthetic t:I


# direct methods
.method public constructor <init>(ILz0/J;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA/E;->q:I

    .line 1
    iput p1, p0, LA/E;->r:I

    iput-object p2, p0, LA/E;->s:Lz0/J;

    iput p3, p0, LA/E;->t:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lz0/J;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA/E;->q:I

    .line 2
    iput-object p1, p0, LA/E;->s:Lz0/J;

    iput p2, p0, LA/E;->r:I

    iput p3, p0, LA/E;->t:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LA/E;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lz0/I;

    .line 7
    .line 8
    iget-object v0, p0, LA/E;->s:Lz0/J;

    .line 9
    .line 10
    iget v1, v0, Lz0/J;->q:I

    .line 11
    .line 12
    iget v2, p0, LA/E;->r:I

    .line 13
    .line 14
    sub-int/2addr v2, v1

    .line 15
    int-to-float v1, v2

    .line 16
    const/high16 v2, 0x40000000    # 2.0f

    .line 17
    .line 18
    div-float/2addr v1, v2

    .line 19
    invoke-static {v1}, LD5/a;->G(F)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget v3, p0, LA/E;->t:I

    .line 24
    .line 25
    iget v4, v0, Lz0/J;->r:I

    .line 26
    .line 27
    sub-int/2addr v3, v4

    .line 28
    int-to-float v3, v3

    .line 29
    div-float/2addr v3, v2

    .line 30
    invoke-static {v3}, LD5/a;->G(F)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {p1, v0, v1, v2}, Lz0/I;->d(Lz0/I;Lz0/J;II)V

    .line 35
    .line 36
    .line 37
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 38
    .line 39
    return-object p1

    .line 40
    :pswitch_0
    check-cast p1, Lz0/I;

    .line 41
    .line 42
    iget v0, p0, LA/E;->r:I

    .line 43
    .line 44
    iget v1, p0, LA/E;->t:I

    .line 45
    .line 46
    iget-object v2, p0, LA/E;->s:Lz0/J;

    .line 47
    .line 48
    invoke-static {p1, v2, v0, v1}, Lz0/I;->d(Lz0/I;Lz0/J;II)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 52
    .line 53
    return-object p1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
