.class public final Li3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li3/c;


# instance fields
.field public final a:Z

.field public final b:Landroid/graphics/Path$FillType;

.field public final c:Ljava/lang/String;

.field public final d:Lh3/a;

.field public final e:Lh3/a;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLandroid/graphics/Path$FillType;Lh3/a;Lh3/a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li3/m;->c:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Li3/m;->a:Z

    .line 7
    .line 8
    iput-object p3, p0, Li3/m;->b:Landroid/graphics/Path$FillType;

    .line 9
    .line 10
    iput-object p4, p0, Li3/m;->d:Lh3/a;

    .line 11
    .line 12
    iput-object p5, p0, Li3/m;->e:Lh3/a;

    .line 13
    .line 14
    iput-boolean p6, p0, Li3/m;->f:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(La3/y;La3/k;Lj3/b;)Lc3/d;
    .locals 0

    .line 1
    new-instance p2, Lc3/h;

    .line 2
    .line 3
    invoke-direct {p2, p1, p3, p0}, Lc3/h;-><init>(La3/y;Lj3/b;Li3/m;)V

    .line 4
    .line 5
    .line 6
    return-object p2
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ShapeFill{color=, fillEnabled="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Li3/m;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x7d

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
