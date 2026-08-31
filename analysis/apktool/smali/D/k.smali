.class public final LD/k;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic A:I

.field public final synthetic B:I

.field public final synthetic q:Lc0/m;

.field public final synthetic r:LD/y;

.field public final synthetic s:LD/c;

.field public final synthetic t:LA/L;

.field public final synthetic u:Lw/I;

.field public final synthetic v:Z

.field public final synthetic w:Lv/l;

.field public final synthetic x:LA/g;

.field public final synthetic y:LA/e;

.field public final synthetic z:LB5/c;


# direct methods
.method public constructor <init>(Lc0/m;LD/y;LD/c;LA/L;Lw/I;ZLv/l;LA/g;LA/e;LB5/c;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LD/k;->q:Lc0/m;

    .line 2
    .line 3
    iput-object p2, p0, LD/k;->r:LD/y;

    .line 4
    .line 5
    iput-object p3, p0, LD/k;->s:LD/c;

    .line 6
    .line 7
    iput-object p4, p0, LD/k;->t:LA/L;

    .line 8
    .line 9
    iput-object p5, p0, LD/k;->u:Lw/I;

    .line 10
    .line 11
    iput-boolean p6, p0, LD/k;->v:Z

    .line 12
    .line 13
    iput-object p7, p0, LD/k;->w:Lv/l;

    .line 14
    .line 15
    iput-object p8, p0, LD/k;->x:LA/g;

    .line 16
    .line 17
    iput-object p9, p0, LD/k;->y:LA/e;

    .line 18
    .line 19
    iput-object p10, p0, LD/k;->z:LB5/c;

    .line 20
    .line 21
    iput p11, p0, LD/k;->A:I

    .line 22
    .line 23
    iput p12, p0, LD/k;->B:I

    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, LD/k;->A:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, LP/b;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v11

    .line 17
    iget p1, p0, LD/k;->B:I

    .line 18
    .line 19
    invoke-static {p1}, LP/b;->w(I)I

    .line 20
    .line 21
    .line 22
    move-result v12

    .line 23
    iget-object v0, p0, LD/k;->q:Lc0/m;

    .line 24
    .line 25
    iget-object v1, p0, LD/k;->r:LD/y;

    .line 26
    .line 27
    iget-object v2, p0, LD/k;->s:LD/c;

    .line 28
    .line 29
    iget-object v3, p0, LD/k;->t:LA/L;

    .line 30
    .line 31
    iget-object v4, p0, LD/k;->u:Lw/I;

    .line 32
    .line 33
    iget-boolean v5, p0, LD/k;->v:Z

    .line 34
    .line 35
    iget-object v6, p0, LD/k;->w:Lv/l;

    .line 36
    .line 37
    iget-object v7, p0, LD/k;->x:LA/g;

    .line 38
    .line 39
    iget-object v8, p0, LD/k;->y:LA/e;

    .line 40
    .line 41
    iget-object v9, p0, LD/k;->z:LB5/c;

    .line 42
    .line 43
    invoke-static/range {v0 .. v12}, LE3/h;->e(Lc0/m;LD/y;LD/c;LA/L;Lw/I;ZLv/l;LA/g;LA/e;LB5/c;LP/o;II)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 47
    .line 48
    return-object p1
.end method
