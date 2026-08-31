.class public final Landroidx/room/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lj2/c;

.field public final d:LD2/o;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:I

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/util/Set;

.field public final m:Ljava/util/List;

.field public final n:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lj2/c;LD2/o;Ljava/util/List;ZILjava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZLjava/util/Set;Ljava/util/List;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "migrationContainer"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "journalMode"

    .line 7
    .line 8
    invoke-static {p7, v0}, Lk1/i;->p(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "queryExecutor"

    .line 12
    .line 13
    invoke-static {p8, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "transactionExecutor"

    .line 17
    .line 18
    invoke-static {p9, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "typeConverters"

    .line 22
    .line 23
    invoke-static {p13, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "autoMigrationSpecs"

    .line 27
    .line 28
    invoke-static {p14, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Landroidx/room/h;->a:Landroid/content/Context;

    .line 35
    .line 36
    iput-object p2, p0, Landroidx/room/h;->b:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p3, p0, Landroidx/room/h;->c:Lj2/c;

    .line 39
    .line 40
    iput-object p4, p0, Landroidx/room/h;->d:LD2/o;

    .line 41
    .line 42
    iput-object p5, p0, Landroidx/room/h;->e:Ljava/util/List;

    .line 43
    .line 44
    iput-boolean p6, p0, Landroidx/room/h;->f:Z

    .line 45
    .line 46
    iput p7, p0, Landroidx/room/h;->g:I

    .line 47
    .line 48
    iput-object p8, p0, Landroidx/room/h;->h:Ljava/util/concurrent/Executor;

    .line 49
    .line 50
    iput-object p9, p0, Landroidx/room/h;->i:Ljava/util/concurrent/Executor;

    .line 51
    .line 52
    iput-boolean p10, p0, Landroidx/room/h;->j:Z

    .line 53
    .line 54
    iput-boolean p11, p0, Landroidx/room/h;->k:Z

    .line 55
    .line 56
    iput-object p12, p0, Landroidx/room/h;->l:Ljava/util/Set;

    .line 57
    .line 58
    iput-object p13, p0, Landroidx/room/h;->m:Ljava/util/List;

    .line 59
    .line 60
    iput-object p14, p0, Landroidx/room/h;->n:Ljava/util/List;

    .line 61
    .line 62
    return-void
.end method
