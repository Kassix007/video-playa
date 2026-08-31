.class public final LC/l;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic A:I

.field public final synthetic q:Lc0/m;

.field public final synthetic r:LC/A;

.field public final synthetic s:LA/L;

.field public final synthetic t:Lw/I;

.field public final synthetic u:Z

.field public final synthetic v:Lv/l;

.field public final synthetic w:Lc0/c;

.field public final synthetic x:LA/g;

.field public final synthetic y:LB5/c;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lc0/m;LC/A;LA/L;Lw/I;ZLv/l;Lc0/c;LA/g;LB5/c;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/l;->q:Lc0/m;

    .line 2
    .line 3
    iput-object p2, p0, LC/l;->r:LC/A;

    .line 4
    .line 5
    iput-object p3, p0, LC/l;->s:LA/L;

    .line 6
    .line 7
    iput-object p4, p0, LC/l;->t:Lw/I;

    .line 8
    .line 9
    iput-boolean p5, p0, LC/l;->u:Z

    .line 10
    .line 11
    iput-object p6, p0, LC/l;->v:Lv/l;

    .line 12
    .line 13
    iput-object p7, p0, LC/l;->w:Lc0/c;

    .line 14
    .line 15
    iput-object p8, p0, LC/l;->x:LA/g;

    .line 16
    .line 17
    iput-object p9, p0, LC/l;->y:LB5/c;

    .line 18
    .line 19
    iput p10, p0, LC/l;->z:I

    .line 20
    .line 21
    iput p11, p0, LC/l;->A:I

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, LC/l;->z:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, LP/b;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget p1, p0, LC/l;->A:I

    .line 18
    .line 19
    invoke-static {p1}, LP/b;->w(I)I

    .line 20
    .line 21
    .line 22
    move-result v11

    .line 23
    iget-object v0, p0, LC/l;->q:Lc0/m;

    .line 24
    .line 25
    iget-object v1, p0, LC/l;->r:LC/A;

    .line 26
    .line 27
    iget-object v2, p0, LC/l;->s:LA/L;

    .line 28
    .line 29
    iget-object v3, p0, LC/l;->t:Lw/I;

    .line 30
    .line 31
    iget-boolean v4, p0, LC/l;->u:Z

    .line 32
    .line 33
    iget-object v5, p0, LC/l;->v:Lv/l;

    .line 34
    .line 35
    iget-object v6, p0, LC/l;->w:Lc0/c;

    .line 36
    .line 37
    iget-object v7, p0, LC/l;->x:LA/g;

    .line 38
    .line 39
    iget-object v8, p0, LC/l;->y:LB5/c;

    .line 40
    .line 41
    invoke-static/range {v0 .. v11}, Ly4/b;->a(Lc0/m;LC/A;LA/L;Lw/I;ZLv/l;Lc0/c;LA/g;LB5/c;LP/o;II)V

    .line 42
    .line 43
    .line 44
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 45
    .line 46
    return-object p1
.end method
