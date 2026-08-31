.class public final Le3/k;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:La3/k;

.field public final synthetic r:F

.field public final synthetic s:Lc0/m;


# direct methods
.method public constructor <init>(La3/k;FLc0/m;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Le3/k;->q:La3/k;

    .line 2
    .line 3
    iput p2, p0, Le3/k;->r:F

    .line 4
    .line 5
    iput-object p3, p0, Le3/k;->s:Lc0/m;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LP/o;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    const/16 p2, 0x181

    .line 9
    .line 10
    invoke-static {p2}, LP/b;->w(I)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iget-object v0, p0, Le3/k;->q:La3/k;

    .line 15
    .line 16
    iget v1, p0, Le3/k;->r:F

    .line 17
    .line 18
    iget-object v2, p0, Le3/k;->s:Lc0/m;

    .line 19
    .line 20
    invoke-static {v0, v1, v2, p1, p2}, LD5/a;->e(La3/k;FLc0/m;LP/o;I)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 24
    .line 25
    return-object p1
.end method
