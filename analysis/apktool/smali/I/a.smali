.class public final LI/a;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lc0/m;

.field public final synthetic t:LL0/F;

.field public final synthetic u:I

.field public final synthetic v:Z

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lc0/m;LL0/F;IZIIII)V
    .locals 0

    .line 1
    iput p9, p0, LI/a;->q:I

    iput-object p1, p0, LI/a;->r:Ljava/lang/String;

    iput-object p2, p0, LI/a;->s:Lc0/m;

    iput-object p3, p0, LI/a;->t:LL0/F;

    iput p4, p0, LI/a;->u:I

    iput-boolean p5, p0, LI/a;->v:Z

    iput p6, p0, LI/a;->w:I

    iput p7, p0, LI/a;->x:I

    iput p8, p0, LI/a;->y:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LI/a;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v8, p1

    .line 7
    check-cast v8, LP/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    iget p1, p0, LI/a;->y:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, LP/b;->w(I)I

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    iget-object v1, p0, LI/a;->r:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, p0, LI/a;->s:Lc0/m;

    .line 25
    .line 26
    iget-object v3, p0, LI/a;->t:LL0/F;

    .line 27
    .line 28
    iget v4, p0, LI/a;->u:I

    .line 29
    .line 30
    iget-boolean v5, p0, LI/a;->v:Z

    .line 31
    .line 32
    iget v6, p0, LI/a;->w:I

    .line 33
    .line 34
    iget v7, p0, LI/a;->x:I

    .line 35
    .line 36
    invoke-static/range {v1 .. v9}, LD5/a;->b(Ljava/lang/String;Lc0/m;LL0/F;IZIILP/o;I)V

    .line 37
    .line 38
    .line 39
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_0
    move-object v7, p1

    .line 43
    check-cast v7, LP/o;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 48
    .line 49
    .line 50
    iget p1, p0, LI/a;->y:I

    .line 51
    .line 52
    or-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    invoke-static {p1}, LP/b;->w(I)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    iget-object v0, p0, LI/a;->r:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v1, p0, LI/a;->s:Lc0/m;

    .line 61
    .line 62
    iget-object v2, p0, LI/a;->t:LL0/F;

    .line 63
    .line 64
    iget v3, p0, LI/a;->u:I

    .line 65
    .line 66
    iget-boolean v4, p0, LI/a;->v:Z

    .line 67
    .line 68
    iget v5, p0, LI/a;->w:I

    .line 69
    .line 70
    iget v6, p0, LI/a;->x:I

    .line 71
    .line 72
    invoke-static/range {v0 .. v8}, LD5/a;->a(Ljava/lang/String;Lc0/m;LL0/F;IZIILP/o;I)V

    .line 73
    .line 74
    .line 75
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 76
    .line 77
    return-object p1

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
